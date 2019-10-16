package tech.fpax.daerahwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "Panghegar Waterboom", "Kampoeng Tulip", "Edukidzment", "Batununggal Indah Club",
            "Alun-Alun Kota Bandung", "Trans Studio Bandung", "Water Park Bandung Indah", "d'Fun Station" , "Peta Park" , "Taman Lalu Lintas Ade Irma Suryani Nasution",
    };


    int[] listviewImage = new int[]{
            R.mipmap.p1 ,  R.mipmap.p2 ,  R.mipmap.p3 ,  R.mipmap.p4 ,  R.mipmap.p5 ,  R.mipmap.p6 ,  R.mipmap.p7,  R.mipmap.p8,  R.mipmap.p9,  R.mipmap.px,
    };

    String[] listviewShortDescription = new String[]{
            "Jl. Mengger Tengah No.37", "Jl. Pasir Pogor Raya Jl. Ciwastra", "JL. Suryalaya Indah No.1-3, Cijagra, Lengkong", "Soekarno Hatta, Jalan Batununggal Indah IX",
            "Jl. Asia Afrika", "Jl. Gatot Subroto No.289", "Jalan Terusan Kopo KM 8,4, Sulaiman, ", "Jl. Candra Kirana No. 1,, Perm. Singgasana" , "Jl. Peta No.229" , "Jl. Belitung No.1" ,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 10; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
        ListView androidListView = (ListView) findViewById(R.id.lv);
        androidListView.setAdapter(simpleAdapter);
    }
}
package com.wiktor.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

/**
 * video   https://www.youtube.com/watch?v=Vyqz_-sJGFk
 */
public class ResyclerViewActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList <String> mNames = new ArrayList <>();
    private ArrayList <String> mImageUrls = new ArrayList <>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resycler_view);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/10519003_794944887230135_2171154427676180517_o.jpg?_nc_cat=102&_nc_ht=scontent.fhel6-1.fna&oh=ee736c400b674258e8429e329dea3401&oe=5CD9B8C8");
        mNames.add("Job");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t1.0-9/11393162_949012345156721_3395381270151289984_n.jpg?_nc_cat=101&_nc_ht=scontent.fhel6-1.fna&oh=b9eaecc44a62c8937493efb87f93764b&oe=5C965C37");
        mNames.add("Marinka");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/10296028_930003160390973_7266640359568938909_o.jpg?_nc_cat=102&_nc_ht=scontent.fhel6-1.fna&oh=e9a781d33311185b5bcff2fc67f6e27f&oe=5C935FAF");
        mNames.add("Marinka");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t1.0-9/10801673_821153074609316_2507999722792233487_n.jpg?_nc_cat=107&_nc_ht=scontent.fhel6-1.fna&oh=734472519092a65b651ed63a1153b15d&oe=5CA4D546");
        mNames.add("TZ");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/10750272_818720624852561_5127056324802016509_o.jpg?_nc_cat=110&_nc_ht=scontent.fhel6-1.fna&oh=f3cf010a6bf83f4622e96577b3deddf2&oe=5C9DBC79");
        mNames.add("Car");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t1.0-9/1234298_811637452227545_8744959817347591985_n.jpg?_nc_cat=105&_nc_ht=scontent.fhel6-1.fna&oh=14e0a1576800c662d84bb623877a6ee6&oe=5C963C9D");
        mNames.add("Nogi");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t1.0-9/10362863_811635632227727_442237785140435992_n.jpg?_nc_cat=101&_nc_ht=scontent.fhel6-1.fna&oh=074b38f9ff4202a3d86e8fb48e352e36&oe=5C92A67C");
        mNames.add("Kite");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t1.0-9/10629683_811163655608258_807474343747009346_n.jpg?_nc_cat=103&_nc_ht=scontent.fhel6-1.fna&oh=c4b4396c54df378ce1a092231c7429ce&oe=5C94D9B0");
        mNames.add("Notya");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/1524304_809081165816507_843403141477893614_o.jpg?_nc_cat=111&_nc_ht=scontent.fhel6-1.fna&oh=e53bd18f169b371ceaa8887f8201cfcb&oe=5C8F8715");
        mNames.add("Driver");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/1601896_795363223854968_2299058402499933717_o.jpg?_nc_cat=101&_nc_ht=scontent.fhel6-1.fna&oh=eff65902e074b95002da7d0a4434f3e1&oe=5CD21A65");
        mNames.add("Cuba");

        mImageUrls.add("https://scontent.fhel6-1.fna.fbcdn.net/v/t31.0-8/1780992_795362843855006_6508030461430847882_o.jpg?_nc_cat=104&_nc_ht=scontent.fhel6-1.fna&oh=dfc720b6d7e2bcb9414ac2a9b2489f8c&oe=5C967FB5");
        mNames.add("Beer");

        initRecycleView();

    }

    private void initRecycleView() {
        Log.d(TAG, "intiRecycleView: init recycleView.");
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecicleViewAdapter adapter = new RecicleViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}

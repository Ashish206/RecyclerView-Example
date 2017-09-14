package recyclerview.droidtuts4you.com.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RViewAdapter mAdapter;
    private List<RView> mRVList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RViewAdapter(mRVList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        loadData();
    }

    private void loadData() {
        RView androidList = new RView("Cupcake", "1.5", R.drawable.android_cupcake);
        mRVList.add(androidList);

        androidList = new RView("Donut", "1.6", R.drawable.android_donut);
        mRVList.add(androidList);

        androidList = new RView("Eclair", "2.0", R.drawable.android_eclair);
        mRVList.add(androidList);

        androidList = new RView("Froyo", "2.2", R.drawable.android_froyo);
        mRVList.add(androidList);

        androidList = new RView("Gingerbread", "2.3", R.drawable.android_gingerbread);
        mRVList.add(androidList);

        androidList = new RView("Honeycomb", "3.0", R.drawable.android_honeycomb);
        mRVList.add(androidList);

        androidList = new RView("Ice Cream Sandwich", "4.0", R.drawable.android_icecream_sandwich);
        mRVList.add(androidList);

        androidList = new RView("Jelly Bean", "4.2", R.drawable.android_jellybean);
        mRVList.add(androidList);

        androidList = new RView("KitKat", "4.4", R.drawable.kitkat);
        mRVList.add(androidList);

        androidList = new RView("Lollipop", "5.0", R.drawable.android_lollipop);
        mRVList.add(androidList);

        androidList = new RView("Marshmallow", "6.0", R.drawable.marshmallow);
        mRVList.add(androidList);

        androidList = new RView("Nougat", "7.0", R.drawable.android_nougat);
        mRVList.add(androidList);

        androidList = new RView("Oreo", "8.0", R.drawable.android_oreo);
        mRVList.add(androidList);

        mAdapter.notifyDataSetChanged();
    }
}

package com.wiktor.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// todo Нужно ли наследоваться от istActivity?

public class ListViewActivity extends AppCompatActivity {

    String[] valuesss = {"До свидания",
            "Arrivederci",
            "До побачення",
            "Aloha",
            "Khairete",
            "Нахвамдис",
            "Adios",
            "Auf Wiedersehen",
            "Hoschakalin",
            "Au revoir",
            "Sayonara"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        String[] values2 = new String[11];
        values2[0] = "Дзякую";
        values2[1] = "Evkaristo";
        values2[2] = "Gracias";
        values2[3] = "Grazie";
        values2[4] = "Danke schön";
        values2[5] = "Хвала";
        values2[6] = "Teşekkür ederim / Sagolun";
        values2[7] = "Rahmat";
        values2[8] = "Merci";
        values2[9] = "Arigato";
        values2[10] = "Tänan";

        ListView lv = findViewById(R.id.list_view_demo);
        //В примере мы используем готовую системную разметку  android.R.layout.simple_list_item_1
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, valuesss );

        lv.setAdapter(adapter);



        ListView lv2 = findViewById(R.id.list_view_demo2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter <String>(this, R.layout.simple_list_item_2
        , values2);

        lv2.setAdapter(adapter2);
    }

}

/**
    Если вы будете брать строки из ресурсов, то код будет таким:

final String[] catNames = {
        getResources().getString(R.string.name1),
        getResources().getString(R.string.name2),
        getResources().getString(R.string.name3),
        getResources().getString(R.string.name4),
        getResources().getString(R.string.name5),
        };
        А будет еще лучше, если вы воспользуетесь специально предназначенным для этого случая типом ресурса <string-array>. В файле res/values/strings.xml добавьте следующее:


<string-array name="cat_names">
<item>Рыжик</item>
<item>Барсик</item>
<item>Мурзик</item>
<item>Мурка</item>
<item>Васька</item>
<item>Томасина</item>
<item>Кристина</item>
<item>Пушок</item>
<item>Дымка</item>
<item>Кузя</item>
<item>Китти</item>
<item>Масяня</item>
<item>Симба</item>
</string-array>
        И тогда в коде используйте для объявления массива строк:
        String[] catNames = getResources().getStringArray(R.array.cat_names);*/

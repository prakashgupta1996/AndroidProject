package com.example.recvycle;
import java.util.HashMap;
import java.util.Map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "pav");

        db.collection("food").add(map);
        setContentView(R.layout.activity_main);
    }
}

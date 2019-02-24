package com.example.pertemuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTeam;
    private ArrayList<FootballModel> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_team_list);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(FootballData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        FootballAdapter footballAdapter = new FootballAdapter(this);
        footballAdapter.setFootballModels(listTeam);
        rvTeam.setAdapter(footballAdapter);
    }
}

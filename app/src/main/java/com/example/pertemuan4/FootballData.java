package com.example.pertemuan4;

import java.util.ArrayList;

public class FootballData {
    private static String[] title=new String[]{"Manchester United","Paris Saint German","FC Barcelona",
    "Bayern Munchen", "Chelsea FC", "Real Madrid", "Arsenal FC"};

    private static int thumbnail[] = new int[]{R.drawable.mutd,R.drawable.psg,R.drawable.barca,R.drawable.bayern,R.drawable.chelsea,R.drawable.madrid,R.drawable.arsenal};

    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i<title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            list.add(footballModel);
        }
        return list;
    }
}

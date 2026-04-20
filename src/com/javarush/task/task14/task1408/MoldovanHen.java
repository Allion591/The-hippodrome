package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    String country = Country.MOLDOVA;

    public int getCountOfEggsPerMonth() {
        return 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
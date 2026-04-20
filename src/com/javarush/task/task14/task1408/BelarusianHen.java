package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    String country = Country.BELARUS;

    public int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
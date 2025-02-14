public class BooleanExpressionsDemo{
    public static void main(String[] args){
        boolean isSunny=true;
        boolean hasClouds=false;
        int temperature=25;
        int windSpeed=15;
        boolean isHot= temperature>30;
        boolean isBreezy= windSpeed<=20;
        boolean goodWeather= isSunny&&!hasClouds;
        boolean okWeather= isSunny||isBreezy;
        boolean isCloudy= !isSunny;
        boolean variableWeather = isSunny ^ hasClouds;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Does it have clouds? " + hasClouds);
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Is it hot? " + isHot);
        System.out.println("Is it breezy? " + isBreezy);
        System.out.println("Is the weather good? " + goodWeather);
        System.out.println("Is the weather okay? " + okWeather);
        System.out.println("Is it cloudy? " + isCloudy);
        System.out.println("Variable weather (XOR result): " + variableWeather);

        

    }
}
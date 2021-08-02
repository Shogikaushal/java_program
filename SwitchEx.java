class SwitchEx{
public static void main(String args[]){
String trafficSignal="red";
Switch(trafficSignal){
case"red":System.out.println("stop");break;
case"green":System.out.println("move");break;
case"yellow":System.out.println("ready");break;
default:System.out.println("invalid value");
}
}
}


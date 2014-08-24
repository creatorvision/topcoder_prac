//Achiver@creatorvision
//SRM144_DIV2

import java.util.*;
import java.lang.*;

public class Time {

		public String whatTime (int second){

		if (second == 0) {
			return "0:0:0";
		}
		else{

			int hr,min,sec;

			hr=second/3600;
			min=(second%3600)/60;
			sec=(second%60)%60;

			String str= Integer.toString(hr)+":"+Integer.toString(min)+":"+Integer.toString(sec);
			return str;
		}
	}

}
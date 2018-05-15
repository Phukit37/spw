package f2.spw;

class Score{
		int i = 0;
		int count = 0;
		double difficulty = 0.1;
		long score = 0;

	public Long countscore(){
		if (difficulty == 0.1){
			score = 10;
		}
		if (difficulty == 0.15){
			score = 20;
		}
		if (difficulty == 0.2){
			score = 30;
		}
		if (difficulty == 0.25){
			score = 40;
		}
		if (difficulty == 0.3){
			score = 50;
		}
		if (difficulty == 0.35){
			score = 60;
		}
		if (difficulty == 0.4){
			score = 70;
		}
		if (difficulty == 0.45){
			score = 80;
		}
		if (difficulty == 0.5){
			score = 90;
		}
		if (difficulty == 0.55){
			score = 100;
		}
		if (difficulty == 0.6){
			score = 110;
		}
		if (difficulty == 0.65){
			score = 120;
		}
		if (difficulty == 0.7){
			score = 130;
		}
		if (difficulty == 0.75){
			score = 140;
		}
		if (difficulty == 0.8){
			score = 150;
		}
		if (difficulty == 0.85){
			score = 160;
		}
		return score;
	}

	public Double playharder(int count ){
		if(count == 0){
			difficulty = 0.1;
		}
		if(count == 50){
			difficulty = 0.15;
		}
		if(count == 100){
			difficulty = 0.2;
		}
		if(count == 150){
			difficulty = 0.25;
		} 
		if(count == 250){
			difficulty = 0.3;
		}
		if(count == 400){
			difficulty = 0.35;
		}
		if(count == 800){
			difficulty = 0.4;
		} 
		if(count == 1200){
			difficulty = 0.45;
		}
		if(count == 1500){
			difficulty = 0.5;
		}
		if(count == 1800){
			difficulty = 0.55;
		}
		if(count == 2200){
			difficulty = 0.6;
		}
		if (count == 2500){
			difficulty = 0.65;
		}
		if (count == 2900){
			difficulty = 0.7;
		}
		if (count == 3300){
			difficulty = 0.75;
		}
		if (count == 4000){
			difficulty = 0.8;
		}
		if (count == 5000){
			difficulty = 0.85;	
		}
	  return difficulty;
  }
}
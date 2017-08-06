package aga.app.lottery;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import aga.app.runner.Printer;

@Component
public class Winner implements Printer{
	
	List<String> players;
	
	public Winner(List<String> players) {
		this.players = players;
	}
	
	private String winner() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, players.size());
		return players.get(randomNum);
	}

	@Override
	public void print() {
		System.out.println("The winner is "+winner());
	}

}

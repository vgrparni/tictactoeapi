package com.app.tictactoe.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.tictactoe.openapi.api.TictactoeApiApiDelegate;
import com.app.tictactoe.openapi.model.Player;

@Service
public class PlayerService implements TictactoeApiApiDelegate {
@Override
public ResponseEntity<List<Player>> getPlayersInfo() {
	System.out.println("test for testing this line");
	return TictactoeApiApiDelegate.super.getPlayersInfo();
}
}

package com.apirest.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService	{

	@Autowired
	PlaylistRepository pr;
	
	@Override
	public Flux<Playlist> findAll() {		
		return pr.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {		
		return pr.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {		
		return pr.save(playlist);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		
		return pr.deleteById(id);	}

}

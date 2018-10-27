package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IProduitRepository;
import com.example.demo.entites.Produit;

@RestController
public class ProduitController {
	
	
	@Autowired
	private IProduitRepository prodRepo;
	
	@RequestMapping("/save")
	public Produit saveProduit(Produit p) {
		prodRepo.save(p);
		return p;	
	}
	
	@RequestMapping("/getall")
	public List<Produit> findAll() {
		
		return prodRepo.findAll();	
	}
	
	@RequestMapping ("/produits")

	public Page<Produit> getProduits(Pageable pageable) {
		return prodRepo.findAll(pageable);
//		public Page<Produit> getProduits(int page){
//		  return prodRepo.findAll(PageRequest.of(page, 5, Sort.by("id")));	
}
	

	
	@RequestMapping("/get")
	public Optional<Produit> getProduit(String ref)
	{
		return prodRepo.findById(ref);
	}
	
	@RequestMapping("/delete")
	public boolean delete(String ref)
	{
		prodRepo.deleteById(ref);
		return true; 
	}
	
	@RequestMapping("/update")
	public Produit update(Produit p)
	{
		prodRepo.save(p);
		return p; 
	}

}

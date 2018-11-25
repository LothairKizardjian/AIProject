package imageProcessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javafx.scene.paint.Color;


public class Population{
    private ArrayList<Individual> population;
    
    public Population() {
    	population = new ArrayList<Individual>();
    	for(int i=0; i<100; i++) {
    		Random r = new Random();
    		int random = r.nextInt(50);
    		Individual indiv = new Individual(random);
    		population.add(indiv);
    	}
    }
    
    public Population(Population p) {
    	this.population = new ArrayList<Individual>(p.getPopulation());
    }
    
    public void setPopulation(ArrayList<Individual> p) {
    	this.population = p;
    }
    
    public ArrayList<Individual> getPopulation(){
    	return this.population;
    }
    
    public void setBestIndividual() {
    }
    
    public Individual getBestIndividual() {
    	ArrayList<Individual> copy = new ArrayList<Individual>(population);
    	Collections.sort(copy,new IndividualCompare());
    	return copy.get(0);
    }
    
}

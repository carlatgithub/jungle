package fr.afcepf.atod19.jungle.mbean;



import java.io.Serializable;  
import java.util.List;  

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.afcepf.atod19.ecommerce.jungle.entity.Livre;
import fr.afcepf.atod19.ecommerce.jungle.services.interfaces.IGestionCatalogue;
  
@ManagedBean(name="gridBean")
@SessionScoped
public class GridBean implements Serializable {
	
	   @ManagedProperty(value = "#{gestionCatalogue}")
	   private IGestionCatalogue serviceGestionCatalogue;
	   private int qteCde;
	   private static final long serialVersionUID = 1L;
       private List<Livre> livres;  
	   private Livre selectedLivre;  
	   
	   @PostConstruct
	   public void init()
	   {
		   livres = serviceGestionCatalogue.allLivre();  
		   
		   for(Livre unLivre:livres)
		   {
			   System.out.println(unLivre.getTitre() + " " + unLivre.getNumeroISBN());
		   }
	   }
	   
	   public GridBean() {  
	    	
	    }  
	    public IGestionCatalogue getServiceGestionCatalogue() {
			return serviceGestionCatalogue;
		  }

		  public void setServiceGestionCatalogue(IGestionCatalogue serviceGestionCatalogue) {
			this.serviceGestionCatalogue = serviceGestionCatalogue;
		  } 
	      public Livre getSelectedLivre() {  
	        return selectedLivre;  
	      }  
	  
	     public void setSelectedLivre(Livre selectedLivre) {  
	        this.selectedLivre = selectedLivre;  
	     }  
	  
	
	    public List<Livre> getLivres() {  
	        return livres;  
	    }

		public int getQteCde() {
			return qteCde;
		}

		public void setQteCde(int qteCde) {
			this.qteCde = qteCde;
		}  
	  
	
	}  

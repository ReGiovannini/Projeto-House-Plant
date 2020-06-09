package model;

import java.io.Serializable;



public class Planta implements Serializable {
	private static final long serialVersionUID = 1L;
	public int id;
	public String nome;
	public String tempMin;
	public String tempMax;
	public String umidSoloMin;
	public String umidSoloMax;
	public String descricao;
	
	public Planta() {
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTempMin() {
		return tempMin;
	}
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	public String getTempMax() {
		return tempMax;
	}
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}
	public String getUmidSoloMin() {
		return umidSoloMin;
	}
	public void setUmidSoloMin(String umidSoloMin) {
		this.umidSoloMin = umidSoloMin;
	}
	public String getUmidSoloMax() {
		return umidSoloMax;
	}
	public void setUmidSoloMax(String umidSoloMax) {
		this.umidSoloMax = umidSoloMax;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


		
	
	@Override
	public String toString() {
		return "Planta [id=" + id + ", nome=" + nome + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", umidSoloMin=" + umidSoloMin + ", umidSoloMax=" + umidSoloMax + ", descricao=" + descricao + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempMax == null) {
			if (other.tempMax != null)
				return false;
		} else if (!tempMax.equals(other.tempMax))
			return false;
		if (tempMin == null) {
			if (other.tempMin != null)
				return false;
		} else if (!tempMin.equals(other.tempMin))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (umidSoloMax == null) {
			if (other.umidSoloMax != null)
				return false;
		} else if (!umidSoloMax.equals(other.umidSoloMax))
			return false;
		if (umidSoloMin == null) {
			if (other.umidSoloMin != null)
				return false;
		} else if (!umidSoloMin.equals(other.umidSoloMin))
			return false;
		return true;
	}
	
	
}
	
	























/*
public class Planta implements Serializable {
	private static final long serialVersionUID = 1L;
	public int id;
	public String nome;
	public String tempMin;
	public String tempMax;
	public String umidArMin;
	public String umidArMax;
	public String umidSoloMin;
	public String umidSoloMax;
	
	public Planta() {
		super();
	}



	@Override
	public String toString() {
		return "Estufa [id=" + id + ", nome=" + nome + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", umidArMin="
				+ umidArMin + ", umidArMax=" + umidArMax + ", umidSoloMin=" + umidSoloMin + ", umidSoloMax="
				+ umidSoloMax + "]";
	}



	public Planta(int id, String nome, String tempMin, String tempMax, String umidArMin, String umidArMax,
			String umidSoloMin, String umidSoloMax) {
		super();
		this.id = id;
		this.nome = nome;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.umidArMin = umidArMin;
		this.umidArMax = umidArMax;
		this.umidSoloMin = umidSoloMin;
		this.umidSoloMax = umidSoloMax;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTempMin() {
		return tempMin;
	}



	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}



	public String getTempMax() {
		return tempMax;
	}



	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}



	public String getUmidArMin() {
		return umidArMin;
	}



	public void setUmidArMin(String umidArMin) {
		this.umidArMin = umidArMin;
	}



	public String getUmidArMax() {
		return umidArMax;
	}



	public void setUmidArMax(String umidArMax) {
		this.umidArMax = umidArMax;
	}



	public String getUmidSoloMin() {
		return umidSoloMin;
	}



	public void setUmidSoloMin(String umidSoloMin) {
		this.umidSoloMin = umidSoloMin;
	}



	public String getUmidSoloMax() {
		return umidSoloMax;
	}



	public void setUmidSoloMax(String umidSoloMax) {
		this.umidSoloMax = umidSoloMax;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tempMax == null) ? 0 : tempMax.hashCode());
		result = prime * result + ((tempMin == null) ? 0 : tempMin.hashCode());
		result = prime * result + ((umidArMax == null) ? 0 : umidArMax.hashCode());
		result = prime * result + ((umidArMin == null) ? 0 : umidArMin.hashCode());
		result = prime * result + ((umidSoloMax == null) ? 0 : umidSoloMax.hashCode());
		result = prime * result + ((umidSoloMin == null) ? 0 : umidSoloMin.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempMax == null) {
			if (other.tempMax != null)
				return false;
		} else if (!tempMax.equals(other.tempMax))
			return false;
		if (tempMin == null) {
			if (other.tempMin != null)
				return false;
		} else if (!tempMin.equals(other.tempMin))
			return false;
		if (umidArMax == null) {
			if (other.umidArMax != null)
				return false;
		} else if (!umidArMax.equals(other.umidArMax))
			return false;
		if (umidArMin == null) {
			if (other.umidArMin != null)
				return false;
		} else if (!umidArMin.equals(other.umidArMin))
			return false;
		if (umidSoloMax == null) {
			if (other.umidSoloMax != null)
				return false;
		} else if (!umidSoloMax.equals(other.umidSoloMax))
			return false;
		if (umidSoloMin == null) {
			if (other.umidSoloMin != null)
				return false;
		} else if (!umidSoloMin.equals(other.umidSoloMin))
			return false;
		return true;
	}


}
*/
package com.wow.entity;

import java.util.List;

public class CharacterProgression {
	/*"raids": [{
        "name": "Molten Core",
        "lfr": 0,
        "normal": 2,
        "heroic": 0,
        "mythic": 0,
        "id": 2717,
        "bosses": [{
            "id": 11502,
            "name": "Ragnaros",
            "normalKills": 1,
            "normalTimestamp": 1459628927000
        }]
    }*/
	
	private List<Raid> raids;

	public List<Raid> getRaids() {
		return raids;
	}
	public void setRaids(List<Raid> raids) {
		this.raids = raids;
	}

	class Raid {
		private String name;
		private int lfr;
		private int normal;
		private int heroic;
		private int mythic;
		private long id;
		private List<Boss> bosses;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getLfr() {
			return lfr;
		}
		public void setLfr(int lfr) {
			this.lfr = lfr;
		}
		public int getNormal() {
			return normal;
		}
		public void setNormal(int normal) {
			this.normal = normal;
		}
		public int getHeroic() {
			return heroic;
		}
		public void setHeroic(int heroic) {
			this.heroic = heroic;
		}
		public int getMythic() {
			return mythic;
		}
		public void setMythic(int mythic) {
			this.mythic = mythic;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public List<Boss> getBosses() {
			return bosses;
		}
		public void setBosses(List<Boss> bosses) {
			this.bosses = bosses;
		}
	}

}

/**
 * 
 */
package com.wow.test;


import org.junit.Test;

import com.wow.dao.BossDao;
import com.wow.dao.CharacterDao;
import com.wow.dao.DataSourcesDao;
import com.wow.domain.Field;
import com.wow.domain.Region;
import com.wow.util.Util;

/**
 * @author baris.asma
 *
 */
public class BasicTest {
	
	//@Test
	public void getBosses() throws Exception {
		BossDao dao = new BossDao();
		dao.getBosses(null).stream().forEach(System.out::println);
	}
	
	//@Test
	public void getBoss() throws Exception {
		BossDao dao = new BossDao();
		dao.getBoss("53879");//success
		dao.getBoss("ASDF");//fail
		//dao.getBoss("86217");
		System.out.println(dao.getBoss("53879"));//write
	}
	
	@Test
	public void getCharacter() throws Exception{
		CharacterDao dao = new CharacterDao();
		System.out.println(dao.getCharacter("Outland", "Polon", Region.EN_GB));
		System.out.println(dao.getCharacter("Outland", "Tarona", Region.EN_GB));
		System.out.println(dao.getCharacter("Outland", "Polon", Region.EN_GB));
	}

	//@Test
	public void getKey() throws Exception{
		System.out.println(Util.getKey());
	}
	
	//@Test
	public void getCharacterAchievements() throws Exception{
		DataSourcesDao dao = new DataSourcesDao();
		dao.getCharacterAchievements(Region.EN_GB).stream().forEach(System.out::println);
	}
	
	//@Test
	public void getCharacterFeed() throws Exception {
		CharacterDao dao = new CharacterDao();
		System.out.println(dao.getCharacter("Outland", "Polon", Region.EN_GB,Field.FEED,Field.ACHIEVEMENTS)); 
		
	}
	
	//@Test
	public void getCharacterAch() throws Exception {
			CharacterDao dao = new CharacterDao();
			System.out.println(dao.getCharacter("Outland", "Polon", Region.EN_GB,Field.ACHIEVEMENTS)); 
	}

}

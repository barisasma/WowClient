/**
 * 
 */
package com.wow.test;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import com.wow.dao.BossDao;
import com.wow.dao.CharacterDao;
import com.wow.dao.Dao;
import com.wow.domain.CharacterClassObject;
import com.wow.domain.Region;
import com.wow.util.Util;

/**
 * @author baris.asma
 *
 */
public class BasicTest {
	
	//@Before 
	public void fillClassSource() throws Exception{
		CharacterClassObject ccobj = new CharacterClassObject();
		System.out.println(ccobj.get(1));
		
	}
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
	}

	//@Test
	public void getKey() throws Exception{
		System.out.println(Util.getKey());
	}

}

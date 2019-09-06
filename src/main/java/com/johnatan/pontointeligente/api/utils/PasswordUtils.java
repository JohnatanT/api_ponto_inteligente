package com.johnatan.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private final static Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {}
	
	
	/*
	 *  Gera um Hash utilizando o BCrypt
	 * 	@param senha
	 *  @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com o BCrypt");
		BCryptPasswordEncoder byCriptEncoder = new BCryptPasswordEncoder();
		return byCriptEncoder.encode(senha);
	}
}

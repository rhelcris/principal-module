package br.com.sigop.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sigop")
public class SigopApiProperties {

		// TODO: Alterando a origem permitida para o ANGULAR 
		private String origemPermitida = "http://localhost:8000";
		
		private final Seguranca seguranca = new Seguranca();
		
		public Seguranca getSeguranca() {
			return seguranca;
		}
		
		public String getOrigemPermitida() {
			return origemPermitida;
		}

		public void setOrigemPermitida(String origemPermitida) {
			this.origemPermitida = origemPermitida;
		}


		public static class Seguranca {
			
			private boolean enableHttps;

			public boolean isEnableHttps() {
				return enableHttps;
			}
			public void setEnableHttps(boolean enableHttps) {
				this.enableHttps = enableHttps;
			}
			
		}
	}

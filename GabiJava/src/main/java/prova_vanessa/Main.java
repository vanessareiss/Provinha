package prova_vanessa;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
       
      Engenheiro engenheiro = new Engenheiro("6958", "Daniel", "659.365.395-89", "698.365.98", new Endereco("Ao lado de uma barraca metálica", "69", "Casa", "987-0000", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 15000, EstadoCivil.CASADO, LocalDate.of(2003, Month.MARCH, 10));
      Motoboy motoboy = new Motoboy("9856", "Lucas", "958.365.695-26", "695.265-984", new Endereco("Avenida", "69", "Casa", "9857-000", "Camaçari", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.MASCULINO, 1500, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MARCH, 06));
      Gerente gerente = new Gerente(Bonificacao.GERENTE, "André", "698.365.485", "396.365-98", new Endereco("Rua", "56", "Ao lado da escola", "695.659-000", "Simões filho", UnidadeFederativa.SAO_PAULO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 20000, EstadoCivil.CASADO, LocalDate.of(2001, Month.MARCH, 26));
      Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Breno", "695.365.458-97", "695.695-00", new Endereco("Avenida", "68", "Ao lado da igreja", "9874-000", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.JURIDICO, Genero.MASCULINO, 5000, EstadoCivil.VIUVO, LocalDate.of(1999, Month.MARCH, 12));
        
    
      diretor.admitir(diretor);
      
    }
}

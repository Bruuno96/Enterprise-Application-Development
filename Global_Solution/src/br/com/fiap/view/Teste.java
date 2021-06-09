package br.com.fiap.view;

import java.sql.Date;   
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import br.com.fiap.dao.HotelDao;
import br.com.fiap.dao.ReservaDao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.dao.impl.HotelDaoImpl;
import br.com.fiap.dao.impl.ReservaDaoImpl;
import br.com.fiap.dao.impl.UsuarioDaoImpl;
import br.com.fiap.entity.Dica;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Hotel;
import br.com.fiap.entity.Idioma;
import br.com.fiap.entity.Reserva;
import br.com.fiap.entity.Usuario;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import br.com.fiap.util.DataUtil;

public class Teste {
	
	public static void main(String[] args) {
		
		// Pegar entity manager para persistencia
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		// instância dos daos para cadastrar os objetos
		UsuarioDao usuarioDao = new UsuarioDaoImpl(em);
		HotelDao hotelDao = new HotelDaoImpl(em);
		ReservaDao reservaDao = new ReservaDaoImpl(em);
		
/*LOGICA = cadastrar endereco > cadastrar hotel com endereco do hotel > cadastrar reserva com hotel > cadastrar usuario com reserva e endereco de usuario */
		
		Dica dica1 = new Dica("quando ir ", 23.5, Idioma.PORTUGUES, "Voltagem: 220v / 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica2 = new Dica("quando ir ", 24.5, Idioma.ALEMAO, "Voltagem: 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica3 = new Dica("quando ir ", 25.5, Idioma.ESPANHOL, "Voltagem: 220v / 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica4 = new Dica("quando ir ", 26.5, Idioma.INGLES, "Voltagem: 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica5 = new Dica("quando ir ", 24.5, Idioma.PORTUGUES, "Voltagem: 220v / 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica6 = new Dica("quando ir ", 21.5, Idioma.PORTUGUES, "Voltagem: 220v / 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica7 = new Dica("quando ir ", 26.5, Idioma.INGLES, "Voltagem: 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica8 = new Dica("quando ir ", 20.5, Idioma.PORTUGUES, "Voltagem: 220v / 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");
		Dica dica9 = new Dica("quando ir ", 21.5, Idioma.ALEMAO, "Voltagem: 110v, Tomada: NBR 14136", "REAL BRASILEIRO", "Documento com foto", "Bagagem: Mala roda ou Mochila", "Onibus ou carro");

		
		
		Endereco endereco1 = new Endereco("Av. Sabiá", "04515-001", "Indianópolis", "São Paulo", "SP",825);
		Endereco endereco2 = new Endereco("Av. Roque Petroni Júnior", "04707-000", "Vila Gertrudes", "São Paulo", "SP",1000);
		Endereco endereco3 = new Endereco("R. Pamplona", "01405-002", "Jardim Paulista", "São Paulo", "SP",1315);
		Endereco endereco4 = new Endereco("Av. das Nações Unidas", "04578-903", "Brooklin Novo", "São Paulo", "SP",12559);
		Endereco endereco5 = new Endereco("Av. Ibirapuera", "04029-200", "Ibirapuera", "São Paulo", "SP",2927 );
		Endereco endereco6 = new Endereco("Rua Peixoto Gomide", "01409-001", "Bela Vista", "São Paulo", "SP",707);
		Endereco endereco7 = new Endereco("Av. Cruzeiro do Sul", "02031-000", "Santana", "São Paulo", "SP",1709);
		Endereco endereco8 = new Endereco("Alameda Santos", "01419-000", "Jardins", "São Paulo", "SP",85);
		Endereco endereco9 = new Endereco("Alameda Santos", "01419-002", " Jardim Paulista", "São Paulo", "SP",2233);


		Hotel hotel1 = new Hotel("Confort Ibirapuera", "String_da_foto", 50.00,"descrição do hotel", 5, "link",endereco1, dica1);
		Hotel hotel2 = new Hotel("Blue Tree Premium Morumbi", "String_da_foto", 100.00,"descrição do hotel", 5,"link", endereco2, dica2);
		Hotel hotel3 = new Hotel("Mercure São Paulo Pamplona", "String_da_foto", 150.00,"descrição do hotel", 5,"link", endereco3, dica3);
		Hotel hotel4 = new Hotel("Sheraton São Paulo WTC Hotel", "String_da_foto", 200.00,"descrição do hotel", 5,"link", endereco4, dica4);
		Hotel hotel5 = new Hotel("Bourbon Convention Ibirapuera", "String_da_foto", 250.00,"descrição do hotel", 5,"link", endereco5, dica5);
		Hotel hotel6 = new Hotel("Blue Tree Preimum Paulista", "String_da_foto", 300.00,"descrição do hotel", 5,"link", endereco6, dica6);
		Hotel hotel7 = new Hotel("IBIS Styles São Paulo Anhembi", "String_da_foto", 350.00,"descrição do hotel", 5,"link", endereco7, dica7);
		Hotel hotel8 = new Hotel("Golden Tulip Paulista Plaza", "String_da_foto", 400.00,"descrição do hotel", 5,"link", endereco8, dica8);
		Hotel hotel9 = new Hotel("Renaissance São Paulo Hotel", "String_da_foto", 450.00,"descrição do hotel", 5,"link", endereco9, dica9);


//		Reserva reserva2 = new Reserva(380.00, new GregorianCalendar(2021, 9, 15), new GregorianCalendar(2021, 10, 15), hotel);

		
		Endereco enderecoU = new Endereco("Avenida Paulista", "01311-000", "Cerqueira César", "São Paulo", "SP", 1106);
		
		Usuario u1 = new Usuario("Murilo", "murilo96@gmail.com","password", new GregorianCalendar(1996, 0, 13), enderecoU);
		Usuario u2 = new Usuario("Bruno", "bruno96@gmail.com","password", new GregorianCalendar(1996, 0, 13), enderecoU);
		Usuario u3 = new Usuario("Gustavo", "gustavo96@gmail.com","password", new GregorianCalendar(1996, 0, 13), enderecoU);
		Usuario u4 = new Usuario("Brito Silva", "brito_silva@gmail.com","password", new GregorianCalendar(1996, 0, 13), enderecoU);
						

		
		Reserva reserva1 = new Reserva(140.00, new GregorianCalendar(2021, Calendar.AUGUST, 10), new GregorianCalendar(2021, Calendar.OCTOBER, 13));
		Reserva reserva2 = new Reserva(220.00, new GregorianCalendar(2021, Calendar.AUGUST, 10), new GregorianCalendar(2021, Calendar.DECEMBER, 13));
		Reserva reserva3 = new Reserva(360.00, new GregorianCalendar(2021, Calendar.AUGUST, 10), new GregorianCalendar(2021, Calendar.AUGUST, 13));
		Reserva reserva4 = new Reserva(560.00, new GregorianCalendar(2021, Calendar.AUGUST, 10), new GregorianCalendar(2021, Calendar.SEPTEMBER, 13));
		
		
		
		
		/* INSERIR DADOS NA TABELA */
		try {
			usuarioDao.create(u1);
			usuarioDao.create(u2);
			usuarioDao.create(u3);
			usuarioDao.create(u4);
			hotelDao.create(hotel1);
			hotelDao.create(hotel2);
			hotelDao.create(hotel3);
			hotelDao.create(hotel4);
			hotelDao.create(hotel5);
			hotelDao.create(hotel6);
			hotelDao.create(hotel7);
			hotelDao.create(hotel8);
			hotelDao.create(hotel9);
			usuarioDao.commit();
			hotelDao.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
//		/* FAZER RESERVA */
		try {
			// pegar o usuário com ID: 1
			Usuario user = usuarioDao.read(1);
			
			// Pegar hotel com ID: 3
			Hotel h = hotelDao.read(3);
			
			// Adicionar a reserva na lista de reserva do usuario com ID: 1
			user.addReserva(reserva3);
			
			// Adicionar reserva na lista de reservas do hotel com ID : 3
			h.addReserva(reserva3);
			
			// Atualizar o usuario e hotel com ID: 1 e ID: 3 respectivamente
			usuarioDao.update(user);
			hotelDao.update(h);
			
			// COMMITS do usuario e hotel
			usuarioDao.commit();
			hotelDao.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		/* Pesquisar hoteis */
		List<Hotel> hoteis = hotelDao.listar();
		System.out.println("Buscar Hoteis");
		hoteis.forEach(hotel -> System.out.println("ID: " + hotel.getId()+ " Nome do Hotel "+hotel.getNome()));
//		
//		/* Pesquisar reservas */
		try {
			List<Reserva> reservas = reservaDao.listarReservas();
			System.out.println("Buscar reservas com usuarios ");
			reservas.forEach(reserva -> System.out.println("Reserva pelo: "+reserva.getUsuario().getNome()+" \nNo hotel: "+reserva.getHotel().getNome()));
		} catch (Exception e) {
			System.out.println("Mensagem de erro: "+e.getMessage());
		}
		
		
		/* Pesquisar por nome do Hotel */
		Hotel hotel = hotelDao.buscarPorNome("Confort Ibirapuera");
		System.out.println("\nNome do hotel: "+hotel.getNome()+"\nDescrição do hotel: "+hotel.getDescricao()+"\nPreço diaria: "+hotel.getPreco());
	}
//		
	}
		


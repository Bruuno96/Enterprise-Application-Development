using Fiap.Aula01.Exemplo01.Models;
using System;

namespace Aula01.Models

{
    /*
     * Solution -> Workspace
     * Project -> Project
     * Namespace -> Package
     * using -> import
     * base -> super
     * : -> extends
     * 
     * virtual -> permite a sobrescrita do método
     * override -> palavra reservada que define que o método está sobrescrevendo
     * 
     * Não tem tipo primitivo (int, long, bool, string são abreviaturas para as Classes/Estruturas)
     * Nome de método segue o UpperCamelCase, assim como as classes
     * Nome de atributos privados começam com "_"
     * 
     * Modificadores de acesso:
     * public -> Todos
     * protected -> Classe e classes filhas
     * private -> Somente a classe
     * internal -> Classes do mesmo projeto
     * protected internal -> Classe, classes filhas e classes do mesmo projeto 
     * protected private -> Classe e classes filhas do mesmo projeto
     */

    class Program
    {
        static void Main(string[] args)
        {
            //Instanciar um Produto e atribuir o nome e qtd
            //ALT + Enter ou CTRL + . (sugestão de correção)
            //Produto produto = new Produto("Arroz", 10)
            //{
            //    Quantidade = 100
            //};

            //produto.Nome = "Arroz"; //set
            //Console.WriteLine(produto.Nome); //Get

            //Ler os dados do cliente
            //cw -> tab tab
            Console.WriteLine("Digite o nome");
            string nome = Console.ReadLine(); //Ler um dado inserido pelo usuário

            Console.WriteLine("Digite o cpf");
            string cpf = Console.ReadLine();

            Console.WriteLine("Digite a data de nascimento");
            DateTime data = DateTime.Parse(Console.ReadLine()); //Converte a string para data

            //Instanciar um cliente e atribuir os dados
            Cliente cliente = new Cliente()
            {
                Cpf = cpf,
                DataNascimento = data,
                Nome = nome
            };
            //CTRL + K + C (comenta o que está selecionado)
            //CTRL + K + D (identa o código)
            //cliente.Nome = nome;
            //cliente.Cpf = cpf;
            //cliente.DataNascimento = data;

            //Exibir os dados do cliente
            Console.WriteLine($"Nome: {cliente.Nome} CPF: {cliente.Cpf} Data Nascimento: {cliente.DataNascimento}");

            //Instanciar um livro com os valores
            //Livro livro = new Livro("O Senhor dos anéis", 30, "As duas torres");
            Livro livro = new Livro(nome:"Harry Potter", quantidade: 80, preco: 150, titulo: "A pedra filosofal");

            //Exibir os dados do livro
            Console.WriteLine(livro);

        }
    }
}
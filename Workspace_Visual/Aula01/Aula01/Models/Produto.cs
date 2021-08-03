using System;
using System.Collections.Generic;
using System.Text;

namespace Aula01.Models
{
    // padrao de modificador de acesso de classe é INTERNAL
    public abstract class Produto
    {
        // padrao de modificador de acesso de atributo é PRIVATE
        private string _nome;
        private int _quantidade;
        private Decimal _preco;

        // Getters e Setters (Propriedades)

        public string Nome
        {
            get { return _nome; }
            set { _nome = value; }
        }

        public int Quantidade
        {
            get { return _quantidade; }
            set { _quantidade = value; }
        }

        public Decimal Preco
        {
            get { return _quantidade; }
            set { _preco = value; }
        }

        public void Publicar() 
        {
            Console.WriteLine($"{Nome} publicado");
        }

        public decimal CalcularDesconto()
        {
            return Preco * 0.95m; // m no final para definir um valor monetario com tipo decimal
        }

        public virtual decimal CalcularDesconto(decimal porcentagem)
        {
            return Preco - Preco * 0.50m;
        }

        public virtual void Publicar(String nome) 
        {
            Console.WriteLine($" Livro {nome} foi publica com sucesso");
        }

        public virtual decimal CalcularDesconto(string cupom)
        {
            if (cupom.Contains("xx2021xx"))
            {
                return Preco * 0.45m;
            }
            return Preco;
        }
        public abstract void Vender();

        public override string ToString()
        {
            return $"Nome: {Nome}, Quantidade: {Quantidade}, Preço: {Preco}";
        }


        //  Construtor
        public Produto(string nome, int quantidade, Decimal preco)
        {
            Nome = nome;
            Quantidade = quantidade;
            Preco = preco;
        }
    }
}

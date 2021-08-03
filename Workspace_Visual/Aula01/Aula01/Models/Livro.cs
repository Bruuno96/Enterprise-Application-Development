using System;
using System.Collections.Generic;
using System.Text;

namespace Aula01.Models
{
    class Livro : Produto
    {
        // Propriedades 
        public int Paginas { get; set; }
        public string Titulo { get; set; }
        public string Autor { get; set; }


        // Construtor = ctor + tab + tab
        public Livro(string nome, int quantidade, decimal preco, string titulo) : base(nome, quantidade, preco)
        {
            Titulo = titulo;
        }

        public override void Vender()
        {
            if (!Nome.Contains("e-book"))
            {
                Quantidade--;
            }
        }

        public override void Publicar(string nome)
        {
            Console.WriteLine("Sobrecrita do método usando a palavra reservada virtual");
        }

        public override decimal CalcularDesconto(string cupom)
        {
            if (cupom == "FIAP-2021-2TDSF")
            {
                return Preco * 1;
            }
            return base.CalcularDesconto(cupom);
        }

        public override decimal CalcularDesconto(decimal valor)
        {
            return Preco * 0.35m;
        }

        public override string ToString()
        {
            return base.ToString() + $"Titulo: {Titulo}";
        }

    }
}

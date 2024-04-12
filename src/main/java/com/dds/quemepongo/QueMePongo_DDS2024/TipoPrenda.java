package com.dds.quemepongo.QueMePongo_DDS2024;

public enum TipoPrenda {
    ZAPATOS(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR);


    Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria=categoria;
    }
}
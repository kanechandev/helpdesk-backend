package com.kane.helpdesk.domain.enums;

public enum Status {
    
    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    private Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Perfil toEnum(Integer codigo){
        if(codigo == null){
            return null;
        }

        for(Perfil x : Perfil.values()){
            if(codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Status inválido");
    }
    

    
}

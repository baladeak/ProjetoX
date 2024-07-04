package DTO;

public class VendedorDTO {
    Integer cd_vendedor;
    String nm_vendedor, cpf_vendedor, nm_login, nm_senha;

    public Integer getCd_vendedor() {
        return cd_vendedor;
    }

    public void setCd_vendedor(Integer cd_vendedor) {
        this.cd_vendedor = cd_vendedor;
    }

    public String getNm_vendedor() {
        return nm_vendedor;
    }

    public void setNm_vendedor(String nm_vendedor) {
        this.nm_vendedor = nm_vendedor;
    }

    public String getCpf_vendedor() {
        return cpf_vendedor;
    }

    public void setCpf_vendedor(String cpf_vendedor) {
        this.cpf_vendedor = cpf_vendedor;
    }

    public String getNm_login() {
        return nm_login;
    }

    public void setNm_login(String nm_login) {
        this.nm_login = nm_login;
    }

    public String getNm_senha() {
        return nm_senha;
    }

    public void setNm_senha(String nm_senha) {
        this.nm_senha = nm_senha;
    }
    
    
}

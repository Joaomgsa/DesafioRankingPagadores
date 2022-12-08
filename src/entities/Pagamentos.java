package entities;

import java.util.Objects;

public class Pagamentos implements Comparable<Pagamentos>{

    private String empresa;
    private String data;
    private Integer pago;

    public Pagamentos(String empresa, String data, Integer pago) {
        this.empresa = empresa;
        this.data = data;
        this.pago = pago;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getPago() {
        return pago;
    }

    public void setPago(Integer pago) {
        this.pago = pago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamentos that = (Pagamentos) o;
        return Objects.equals(empresa, that.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empresa);
    }

    @Override
    public int compareTo(Pagamentos outro) {
        return empresa.toUpperCase().compareTo(outro.getEmpresa().toUpperCase());
    }
}

package main;

public class BalançoAdministrativo {

    private double faturamento; 
    private int qteAtendimento;
    private int qteServiço;
    private int qteProduto;

    public BalançoAdministrativo (double faturamento, int qteAtendimento, int qteServiço, int qteProduto) {
        
        this.faturamento = faturamento;
        this.qteAtendimento = qteAtendimento;
        this.qteServiço = qteServiço;
        this.qteProduto = qteProduto;
    }
    public double getFaturamento(){
        return this.faturamento;
    }
    public void setFaturamento (double faturamento) {
        this.faturamento = faturamento;
    }
    public int getQteAtendimento(){
        return this.qteAtendimento;
    }
    public void setQteAtendimento (int qteAtendimento) {
        this.qteAtendimento = qteAtendimento;
    }
    public int getQteServiço(){
        return this.qteServiço;
    }
    public void setQteServiço (int qteServiço) {
        this.qteServiço = qteServiço;
    }
    public int getQteProduto(){
        return this.qteProduto;
    }
    public void setQteProduto (int qteProduto) {
        this.qteProduto = qteProduto;
    }
    
}

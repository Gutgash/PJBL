public class Login {
    private String login;
    private String senha;

    public Login(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public String GetUsuario(){
        return login;
    }
    public String GetSenha(){
        return senha;
    }

}

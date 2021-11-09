package controller;

import DAO.LogDao;

public class LogController {
    LogDao logDao = new LogDao();
    public void registro(String conteudo) {
        logDao.registro(conteudo);
    }
}

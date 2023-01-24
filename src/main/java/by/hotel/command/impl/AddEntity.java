package by.hotel.command.impl;

import by.hotel.bean.User;
import by.hotel.command.Command;
import by.hotel.command.exception.CommandException;
import by.hotel.service.CrudService;
import by.hotel.service.ServiceMapper;

/**
 * Created by 1 on 28.02.2017.
 */
public class AddEntity implements Command {
    public Object execute(String request) throws CommandException {
        try {
            String[] requestParams = request.split("&");
            CrudService service =  ServiceMapper.getService(requestParams[0]);
            service.addEntity(new User());
        }catch (Exception e){
            throw new CommandException(e);
        }
        return null;
    }
}

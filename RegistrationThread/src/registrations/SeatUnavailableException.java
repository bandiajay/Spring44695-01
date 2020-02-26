/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrations;

/**
 *
 * @author ajay
 */
public class SeatUnavailableException extends RuntimeException {

    public SeatUnavailableException() {
        super();
    }
    
    public SeatUnavailableException(String message){
        super(message);
    }
    
}

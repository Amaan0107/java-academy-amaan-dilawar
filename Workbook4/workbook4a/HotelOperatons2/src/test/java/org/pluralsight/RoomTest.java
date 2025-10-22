package org.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void testCheckIn_Successful(){
        Room room = new Room();

        room.cleanRoom();
        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void testCheckIn_AlreadyOccupied(){
        Room room = new Room();

        room.cleanRoom();
        room.checkIn();

        Exception exception = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Cannot check in: Room is occupied or dirty.", exception.getMessage());
    }
    @Test
    void testCheckIn_NotOccupied(){
        Room room = new Room();

        room.cleanRoom();
        room.checkIn();

        Exception exception = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Cannot check in: Room is occupied or dirty.", exception.getMessage());
    }
    @Test
    void testCheckIn_DirtyRoom(){
        Room room = new Room();

        Exception exception = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Cannot check in: Room is occupied or dirty.", exception.getMessage());
    }
    @Test
    void testCheckOut_Successful(){
        Room room = new Room();
        room.cleanRoom();
        room.checkOut();

        assertFalse(room.isOccupied());
    }
    @Test
    void testCheckOut_NotOccupied(){
        Room room = new Room();

        Exception exception = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Cannot check in: Room is occupied or dirty.", exception.getMessage());

    }
    @Test
    void testClean_RoomSuccess(){
        Room room = new Room();
        room.cleanRoom();

        assertFalse(room.isDirty());
    }
    @Test
    void testClean_RoomOccupied(){
        Room room = new Room();

        room.cleanRoom();

        Exception exception = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Cannot check in: Room is occupied or dirty.", exception.getMessage());

    }

}
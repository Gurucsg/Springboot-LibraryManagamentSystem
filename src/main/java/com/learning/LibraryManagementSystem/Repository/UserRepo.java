package com.learning.LibraryManagementSystem.Repository;

import com.learning.LibraryManagementSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

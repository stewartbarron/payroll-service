package org.arunachala.payroll.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}

package entities;

import java.util.Date;
import entities.enums.orderStatus;

public class Order {
  private Integer id;
  private Date moment;
  private orderStatus status;

  public Order() {
  }

  public Order(Integer id, Date moment, orderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getid() {
    return id;
  }

  public void setid(Integer id) {
    this.id = id;
  }

  public Date getmoment() {
    return moment;
  }

  public void setmoment(Date moment) {
    this.moment = moment;
  }

  public orderStatus getstatus() {
    return status;
  }

  public void setstatus(orderStatus status) {
    this.status = status;
  }

  public String toString() {
    return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
  }
}

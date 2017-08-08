package Cars;
import Enums.*;
public abstract class Car {
 private Wheel wheels;
 private SeatNumber seatNumber;
 private SeatColor seatColor;
 private Color color;
 private Model model;
 private String name;
 private double price;

 public Wheel getWheels() {
  return wheels;
 }

 public void setWheels(Wheel wheels) {
  this.wheels = wheels;
 }

 public SeatNumber getSeatNumber() {
  return seatNumber;
 }

 public void setSeatNumber(SeatNumber seatNumber) {
  this.seatNumber = seatNumber;
 }

 public SeatColor getSeatColor() {
  return seatColor;
 }

 public void setSeatColor(SeatColor seatColor) {
  this.seatColor = seatColor;
 }

 public Color getColor() {
  return color;
 }

 public void setColor(Color color) {
  this.color = color;
 }

 public Model getModel() {
  return model;
 }

 public void setModel(Model model) {
  this.model = model;
 }


 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {

  this.price = price;
 }

public  abstract double calcPrice();

 public  void print(){}





}

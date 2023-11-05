clc;
clear all;
clf;
t=[0:0.02:5*%pi];
fc=10;
A=1;
Vm=squarewave(t,40); // The second parameter in the squarewave 
 //function is the percent of the period in 
 //which the signal is positive.
Vc=A/2.*cos(fc.*t);
Va=(1+Vm).*(Vc);
subplot(3,1,1);
plot(t,Vm,'red');
xlabel("Time")
ylabel("Amplitude of Message Signal")
subplot(3,1,2);
plot(t,Vc, 'green');
xlabel("Time")
ylabel("Amplitude of Carrier Signal")
subplot(3,1,3);
plot(t,Va, 'blue');
xlabel("Time")
ylabel("Amplitude of ASK Signal")

int ledPins[] = {13,12,11,10,9,8,7,6};                                              
int pinCount = 8;                                                              
int timer = 1;                                                                    

void setup() {
  for (int thisPin = 0; thisPin < pinCount; thisPin++) {    
    pinMode(ledPins[thisPin], OUTPUT);
  }

}

void loop() {
  for(int thisPin = 0; thisPin < pinCount; thisPin++) {         
    timer = analogRead(A0) / 2;                                       
    digitalWrite(ledPins[thisPin], HIGH);

    delay(100);
    timer = analogRead(A0) / 2;                                 
    digitalWrite(ledPins[thisPin], LOW);

    timer = analogRead(A0) / 2;

  }

  for (int thisPin = pinCount - 1; thisPin >= 0; thisPin--) {   
    timer = analogRead(A0) / 2;
    digitalWrite(ledPins[thisPin], HIGH);
    delay(100);
    timer = analogRead(A0) / 2;
    digitalWrite(ledPins[thisPin], LOW);

    timer = analogRead(A0) / 2;
  }
}
  

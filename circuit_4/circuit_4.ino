int ledPins[] = {13,12,11,10,9,8,7,6};



void setup() {
 int index;
 for(index = 0; index <= 7; index++)
 {
  pinMode(ledPins[index], OUTPUT);
 }
}

void loop() {
  // put your main code here, to run repeatedly:
  int index;
  int delayTime = 100;
  
  for(index = 0; index <= 7; index++)
  {
    digitalWrite(ledPins[index], HIGH);
    delay(100);
  }

  for(index = 7; index >=0; index--)
  {
    digitalWrite(ledPins[index], LOW);
    delay(100);
  }

}

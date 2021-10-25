private Object myState = null;
 
// Sets some internal state in the library
void setState(Object state) {
  if (state == null) {
    // Handle null state
  }
 
  // Defensive copy here when state is mutable
 
  if (isInvalidState(state)) {
    // Handle invalid state
  }
  myState = state;
}
 
// Performs some action using the state passed earlier
void useState() {
  if (myState == null) {
    // Handle no state (e.g., null) condition
  }
  // ...
}

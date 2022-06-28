import React from 'react';

import { StyleSheet, View, Text, TouchableOpacity } from 'react-native';
import { onMyEvent } from 'react-native-eventlibrary';

export default function App() {
  const [result, setResult] = React.useState<string | undefined>();

  function onHandleCustomEvent() {
    onMyEvent('My Event').then(setResult);
  }

  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.button} onPress={onHandleCustomEvent}>
        <Text style={styles.textButton}>Trigger Event</Text>
      </TouchableOpacity>

      <Text style={styles.result}>Result: {result}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    padding: 10,
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
  button: {
    width: '100%',
    height: 50,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: '#787333',
    borderRadius: 10,
    marginBottom: 10,
  },
  textButton: {
    fontSize: 20,
    color: '#FFF',
  },
  result: {
    fontSize: 20,
    color: '#000',
  },
});

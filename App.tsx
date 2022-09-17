/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, {useEffect, useState} from 'react';
import { Text, View, Button, StyleSheet, NativeModules } from 'react-native';
import TextItem from './components/TextItem';
import Clock from './Clock';

const App = () => {
  const [date, setDate] = useState<string>('');

  useEffect(() => {
    Clock.getCurrentTime().then((time: string) => {
      setDate(new Date(time).toDateString());
    });
  }, []);

  return (
    <View style={styles.container}>
      <TextItem text="Hello world from React Native Web" />
      <Text>{date}</Text>
      <Button title="TEST" onPress={testModule} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: 'center'
  },
});

const testModule = () => {
  NativeModules.TestModule.testModule("TEST");
}

export default App;

import { NativeModules } from 'react-native';

const { Eventlibrary } = NativeModules;

export function multiply(a: number, b: number): Promise<number> {
  return Eventlibrary.multiply(a, b);
}

export function onMyEvent(appName: string): Promise<string> {
  return Eventlibrary.onMyEvent(appName);
}

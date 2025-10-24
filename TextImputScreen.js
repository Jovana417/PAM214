
import { Text, StyleSheet, View, TextInput, Button, Alert } from 'react-native';
import React, {Component, useState} from "react";

export default function TexTinput()
{
  const [nombre, setNombre] = useState('');
  const [password, setPasword] = useState('');
  const [comentario, setComentario] = useState('');
  
  const mostrarAlerta = () => {
  
    if(nombre.trim() === ''){
      alert('ERROR, Por favor rellena todos los campos.');
      Alert.alert('ERROR, Por favor rellena el campo.');
    }else{
      Alert.alert(`HOLA,${nombre}!`, 'Tu nombre ha sido registrado con ÉXITO');
      alert(`HOLA,${nombre}!`, 'Tu nombre ha sido registrado con ÉXITO. Tu contraseña es ${password}');
      
      setNombre('');
    }
  };
  return (
      <View style= {styles.container}>
        <Text style= {styles.label}>INGRESA TU NOMBRE: </Text>
        <TextInput
 style={styles.input}
        placeholder='Jovana'
        value={nombre}
        onChangeText={setNombre}
        keyboardType='default'
        autoCapitalize='words'
        />
         <TextInput
        style={styles.input}
        placeholder='password'
        value={password}
        onChangeText={setPassword}
        keyboardType='numeric'
        secureTextEntry={true}
        />
         <TextInput
        style={styles.input}
        multiline={true}
        numberOfLines={4}
        />
        <Button
        title='Saludar'
        onPress={mostrarAlerta}
        color='green' 
        />
      </View>
    ) 
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 20,
    backgroundColor: '#f5f5f5',
  },
  label: {
    fontSize: 20,
    fontWeight: 'bold',
    marginBottom: 10,
    textAlign: 'center',
  },
  input: {
    height: 50,
    borderColor: 'gray',
    borderWidth: 1, //Sirve para ver el borde del input
    borderRadius: 8, // Bordes redondeados
    paddingHorizontal: 15, // Espacio interno a los lados
    marginBottom: 20, // Espacio debajo del input
    fontSize: 16,
  },
});
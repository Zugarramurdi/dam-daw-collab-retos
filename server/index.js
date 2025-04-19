import React, { useEffect, useState } from 'react';
import CodeViewer from './components/CodeViewer';

function App() {
    const [retos, setRetos] = useState({});
    const [code, setCode] = useState('');
    const [selectedFile, setSelectedFile] = useState(null);

    // 👉 Llamada a la API para obtener la lista de retos
    useEffect(() => {
        const fetchRetos = async () => {
            const response = await fetch('http://localhost:3001/api/retos');
            const data = await response.json();
            setRetos(data);
        };

        fetchRetos();
    }, []);

    // 👉 Mostrar el contenido del archivo
    const fetchCode = async (reto, lang, file) => {
        // Aseguramos de codificar la ruta correctamente
        const encodedReto = encodeURIComponent(reto);
        const encodedLang = encodeURIComponent(lang);
        const encodedFile = encodeURIComponent(file);

        const url = `http://localhost:3001/api/retos/${encodedReto}/${encodedLang}/${encodedFile}`;

        try {
            const response = await fetch(url);
            if (!response.ok) {
                throw new Error('Archivo no encontrado');
            }
            const code = await response.text();
            setCode(code); // Guardamos el código para mostrarlo
            setSelectedFile(`${reto}/${lang}/${file}`); // Guardamos el nombre del archivo
        } catch (error) {
            console.error('Error al cargar el archivo:', error);
        }
    };

    return (
        <div>
            <h1>Lista de Retos</h1>
            <div>
                {Object.keys(retos).map((reto) => (
                    <div key={reto}>
                        <h2>{reto}</h2>
                        <ul>
                            {Object.keys(retos[reto]).map((lang) => (
                                <li key={lang}>
                                    <h3>{lang}</h3>
                                    <ul>
                                        {retos[reto][lang].map((file) => (
                                            <li
                                                key={file}
                                                style={{ cursor: 'pointer', color: 'blue' }} // Agregamos estilo para que parezca clickeable
                                                onClick={() => fetchCode(reto, lang, file)} // Asegúrate de que la función se llame correctamente
                                            >
                                                {file}
                                            </li>
                                        ))}
                                    </ul>
                                </li>
                            ))}
                        </ul>
                    </div>
                ))}
            </div>

            {/* Mostrar el código cuando se haya seleccionado un archivo */}
            {selectedFile && (
                <div>
                    <h3>Contenido del archivo: {selectedFile}</h3>
                    <pre>
            <code>{code}</code>
          </pre>
                </div>
            )}
        </div>
    );
}

export default App;

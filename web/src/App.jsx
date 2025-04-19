import React, { useEffect, useState } from 'react';
import CodeViewer from './components/CodeViewer';

function App() {
    const [retos, setRetos] = useState({});
    const [code, setCode] = useState('');
    const [selectedFile, setSelectedFile] = useState(null);
    const [selectedLanguage, setSelectedLanguage] = useState('');

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
            setCode(code);
            setSelectedLanguage(lang);
            setSelectedFile(`${reto}/${lang}/${file}`);
        } catch (error) {
            console.error('Error al cargar el archivo:', error);
        }
    };

    return (
        <div style={{ padding: '2rem' }}>
            <h1>📚 Lista de Retos</h1>
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
                                                onClick={() => fetchCode(reto, lang, file)}
                                                style={{ cursor: 'pointer', color: 'blue', textDecoration: 'underline' }}
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

            {selectedFile && (
                <div style={{ marginTop: '2rem' }}>
                    <h3>📄 Contenido del archivo: <em>{selectedFile}</em></h3>
                    {/* ✅ 4. Usamos CodeViewer para mostrar código resaltado */}
                    <CodeViewer code={code} language={selectedLanguage} />
                </div>
            )}
        </div>
    );
}

export default App;

import { useState } from 'react';
import ParenthesesValidator from './features/ParenthesesValidator';

function App() {
    const [selectedFeature, setSelectedFeature] = useState('');

    return (
        <div style={{ padding: '2rem', fontFamily: 'Arial, sans-serif' }}>
            <h1>Ferramentas</h1>
            <nav style={{ marginBottom: '1rem' }}>
                <button onClick={() => setSelectedFeature('parentheses')}>
                    Validador de Parênteses
                </button>
                {/* Adiciona aqui mais botões no futuro */}
            </nav>

            <div>
                {selectedFeature === 'parentheses' && <ParenthesesValidator />}
                {/* Adiciona aqui os outros componentes futuramente */}
            </div>
        </div>
    );
}

export default App;
